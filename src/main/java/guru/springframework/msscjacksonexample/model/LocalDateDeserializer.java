package guru.springframework.msscjacksonexample.model;

import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDeserializer extends JsonDeserializer<LocalDate>
{
	@Override
	public LocalDate deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
		throws IOException, JacksonException
	{
		//String myDate = jsonParser.getText();  // Ez is tökéletesen jó
		String myDate = jsonParser.readValueAs(String.class);

		try
		{
			LocalDate ld = LocalDate.parse(myDate, DateTimeFormatter.BASIC_ISO_DATE);

			return ld;
		}
		catch (Exception e)
		{
			return null;
		}

	}
}
