package guru.springframework.msscjacksonexample.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * Ez csak azt mutatja, hogyan lehet eltérő mező-elnevezés stratégiára rávenni a Jackson lib-et
 * Érdekes az ActiveProfiles annotáció, ami resources/application-snake.yml, ahol a "snake" meghatározta a
 * használandó property profilt
 */

@ActiveProfiles("snake")
@JsonTest
public class BeerSnakeTest extends BaseTest
{

	@Autowired
	ObjectMapper objectMapper;

	@Test
	void testSnake() throws JsonProcessingException
	{
		BeerDto beerDto = getDto();  // getDto az ősosztályban!

		String jsonString = objectMapper.writeValueAsString(beerDto);

		System.out.println(jsonString);

	}

}
