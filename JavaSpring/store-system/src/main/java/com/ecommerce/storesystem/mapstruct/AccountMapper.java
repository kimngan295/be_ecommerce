package com.ecommerce.storesystem.mapstruct;

import org.mapstruct.Mapper;

import com.ecommerce.storesystem.dto.AccountDto;
import com.ecommerce.storesystem.entity.AccountEntity;

@Mapper(componentModel = "spring")
public interface AccountMapper {
	// ----------------------------Entity To DTO---------------------------

	AccountDto accountEntityToAccountDto(AccountEntity account);
	

	// ---------------------------DTO To Entity----------------------

	AccountEntity accountDtoToAccountEntity(AccountDto accountDto);
	

}
