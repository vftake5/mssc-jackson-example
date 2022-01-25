package guru.springframework.msscjacksonexample.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BaseTest
{
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
			.build();
	}
}
