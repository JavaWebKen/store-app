package com.javawebken.mystore.service;

import com.javawebken.mystore.dto.ContactRequestDto;
import com.javawebken.mystore.dto.ProductDto;

import java.util.List;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);
}
