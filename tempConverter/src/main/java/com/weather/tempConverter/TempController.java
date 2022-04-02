    package com.weather.tempConverter;  
    import java.util.List;  
    import org.springframework.beans.factory.annotation.Autowired;  
    import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  
    
    @RestController  
    public class TempController   
    {  
    	@RequestMapping("/convertToCelsius/{fahrenheit}")
    	public float convertToCelsius(@PathVariable float fahrenheit) {
    		float celsius = (float) ((fahrenheit - 32) / 1.800000);
    		return celsius;
    	}
    	
    	@RequestMapping("/convertToFahrenheit/{celsius}")
    	public float convertToFahrenheit(@PathVariable float celsius) {
    		float fahrenheit = (float) ((celsius * 1.8) + 32);
    		return fahrenheit;
    	}
    }  