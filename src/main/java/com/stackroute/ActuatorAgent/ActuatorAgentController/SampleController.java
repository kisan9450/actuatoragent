package com.stackroute.ActuatorAgent.ActuatorAgentController;

import com.stackroute.ActuatorAgent.ActuatorMetrics.DiskSpaceHealthIndicator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Health;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@Autowired
	DiskSpaceHealthIndicator health;

	@GetMapping("/")
	public String sayHello(@RequestParam(value = "name", defaultValue = "Guest") String name) {
		return "Hello " + name + "!!";
	}

	@GetMapping("/health")
	public Health sayHello() {
		return health.health();

	}



}
