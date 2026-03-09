package com.javawebken.mystore.service;

import com.javawebken.mystore.dto.ProfileRequestDto;
import com.javawebken.mystore.dto.ProfileResponseDto;

public interface IProfileService {

    ProfileResponseDto getProfile();

    ProfileResponseDto updateProfile(ProfileRequestDto profileRequestDto);
}
