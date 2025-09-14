package in.kanika.foodiesapi.service;

import in.kanika.foodiesapi.io.UserRequest;
import in.kanika.foodiesapi.io.UserResponse;

public interface UserService {

    UserResponse registerUser(UserRequest request);

    String findByUserId();
}
