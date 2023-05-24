package com.poc.email.repositories;

import com.poc.email.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
