package com.example.restservice.api.user.delete;

import com.example.restservice.domain.user.User;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDeleteResponse {

    private long id;

    public UserDeleteResponse(User user) {
        id = user.getId();
    }

}
