package com.javawebken.mystore.service;

import com.javawebken.mystore.dto.ContactRequestDto;

import java.util.List;

public interface IContactService {

    boolean saveContact(ContactRequestDto contactRequestDto);
}
