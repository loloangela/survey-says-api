package com.revature.services;

import java.util.List;
import com.revature.model.Response;

public interface ResponseService {

	List<Response> findAll();

	Response findById(int id);

	Response save(Response r);
}
