package com.cmpe202.starbucks.repository;

import org.springframework.data.repository.CrudRepository;
import com.cmpe202.starbucks.model.Card;

public interface ICardRepository  extends CrudRepository<Card, String> {


}
