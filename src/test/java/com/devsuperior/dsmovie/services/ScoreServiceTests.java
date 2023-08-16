package com.devsuperior.dsmovie.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.devsuperior.dsmovie.repositories.MovieRepository;
import com.devsuperior.dsmovie.repositories.ScoreRepository;

@ExtendWith(SpringExtension.class)
public class ScoreServiceTests {
	
	@InjectMocks
	private ScoreService service;
	
	@Mock
	private ScoreRepository repository;
	
	@Mock
	private UserService userService;
	
	@Mock
	private MovieRepository movieRepository;
	
	@BeforeEach
	void setUp() throws Exception {
	}
	
	@Test
	public void saveScoreShouldReturnMovieDTO() {	
	}
	
	@Test
	public void saveScoreShouldThrowResourceNotFoundExceptionWhenNonExistingMovieId() {

	}
}
