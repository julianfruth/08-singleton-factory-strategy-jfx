package ohm.softa.a08.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class OpenMensaAPIService {

	private static OpenMensaAPIService instance;

	private OpenMensaAPI mensaAPI = null;

	private OpenMensaAPIService() {

	}

	public static OpenMensaAPIService getInstance() {

		if (instance == null)/* initialize Retrofit instance */ {
			instance = new OpenMensaAPIService();
		}
		return instance;
	}

	public OpenMensaAPI getApi() {
		if (mensaAPI == null) {
			Gson g = new GsonBuilder().create();
			var retrofit = new Retrofit.Builder()
				.addConverterFactory(GsonConverterFactory.create(g))
				.baseUrl("http://openmensa.org/api/v2/")
				.build();
			mensaAPI = retrofit.create(OpenMensaAPI.class);
		}
		return mensaAPI;
	}

}
