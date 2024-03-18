package org.em.bankservice.mapper;

import lombok.Data;
import org.em.bankservice.dto.UpdateUserDTO;
import org.em.bankservice.dto.UserDTO;
import org.em.bankservice.model.User;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserMapper {

    private final ModelMapper modelMapper;

    public UserDTO toUserDTO(User user) {
        UserDTO userDTO = modelMapper.map(user, UserDTO.class);
        return userDTO;
    }

    public UpdateUserDTO toUpdateUserDTO(User user) {
        UpdateUserDTO updateUserDTO = modelMapper.map(user, UpdateUserDTO.class);
        return updateUserDTO;
    }
}
