package org.em.bankservice.service;

import org.em.bankservice.dto.JwtAuth;
import org.em.bankservice.dto.Login;
import org.em.bankservice.dto.Registr;

public interface AuthorisationService {

    public JwtAuth registr(Registr request);

    public JwtAuth login(Login request);


}
