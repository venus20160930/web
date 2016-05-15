package com.venus.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.venus.api.domain.RequestCreateSampleDto;
import com.venus.api.domain.ResponseSampleDto;
import com.venus.api.service.SampleService;

@RestController
@RequestMapping("/sample")
public class SampleController {
	@Autowired
	private SampleService sampleService;

	@RequestMapping(value = "/selectAll", method = RequestMethod.GET)
	public ResponseEntity<List<ResponseSampleDto>> getSample() {

		List<ResponseSampleDto> samples = sampleService.findAll();
		if (samples.isEmpty()) {

			return new ResponseEntity<List<ResponseSampleDto>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<ResponseSampleDto>>(samples, HttpStatus.OK);
	}

	@RequestMapping(value = "/create",headers="Accept=*/*", method = RequestMethod.POST)
	public ResponseEntity<Void> createSample(@RequestBody RequestCreateSampleDto createSample, UriComponentsBuilder ucBuilder) {

		if (sampleService.exist(createSample.getSampleId())) {

			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		sampleService.save(createSample);

		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/sample/{id}").buildAndExpand(createSample.getSampleName()).toUri());

		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

}
