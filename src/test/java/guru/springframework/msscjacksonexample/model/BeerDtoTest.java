package guru.springframework.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BaseTest
{

	@Autowired
	ObjectMapper objectMapper;

	@Test
	void testSerializeDto() throws JsonProcessingException
	{
		System.out.println(getJson());
	}

	@Test
	void testDeserializeDto() throws JsonProcessingException
	{
		String jsonString = getJson();

		BeerDto beerDto = objectMapper.readValue(jsonString, BeerDto.class);

		System.out.println(jsonString);
		System.out.println(beerDto);
	}

	private String getJson() throws JsonProcessingException
	{
		BeerDto beerDto = getDto();  // getDto az ősosztályban!

		String jsonString = objectMapper.writeValueAsString(beerDto);

		return jsonString;
	}
}