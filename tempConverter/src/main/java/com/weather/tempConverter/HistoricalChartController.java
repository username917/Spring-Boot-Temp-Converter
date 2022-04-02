package com.weather.tempConverter;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HistoricalChartController {

	@GetMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("message", "Hello");
		return "index";
	}
	
	List<HistoricalData> historicalData = Arrays.asList(
			new HistoricalData("03/22/2020", 30, 42),
			new HistoricalData("03/23/2020", 28, 45),
			new HistoricalData("03/24/2020", 22, 39),
			new HistoricalData("03/25/2020", 27, 41),
			new HistoricalData("03/26/2020", 31, 47),
			new HistoricalData("03/27/2020", 33, 45),
			new HistoricalData("03/28/2020", 26, 38),
			new HistoricalData("03/29/2020", 24, 36)
		);

	
	@RequestMapping("/getHistoricalData")
	public List<HistoricalData> getHistoricalData() {
		return historicalData;
	}
	
	@GetMapping("/displayHistoricalData")
	public String historicData(Model model) {
		model.addAttribute("historicalData", historicalData);
		return "index";
	}
	
}
