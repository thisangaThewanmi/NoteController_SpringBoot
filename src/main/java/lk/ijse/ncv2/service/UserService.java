package lk.ijse.ncv2.service;



import lk.ijse.ncv2.dto.UserStatus;
import lk.ijse.ncv2.dto.impl.UserDTO;

import java.util.List;

public interface UserService {
    void saveUser(UserDTO userDTO);
    List<UserDTO> getAllUsers();
    UserStatus getUser(String userId);
    void deleteUser(String userId);
    void updateUser(String userId, UserDTO userDTO);
}
