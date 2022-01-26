package guru.springframework.msscjacksonexample.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest
{

	@Autowired
	ObjectMapper objectMapper;


	BeerDto getDto()
	{
		return BeerDto.builder()
			.id(UUID.randomUUID())
			.beerName("New beer")
			.upc(1L)
			.beerStyle("PILSNER")
			.price(new BigDecimal("120"))
			.createdDate(OffsetDateTime.now())
			.lastUpdatedDate(OffsetDateTime.now())
			.myLocalDate(LocalDate.now())
			.build();
	}
}
