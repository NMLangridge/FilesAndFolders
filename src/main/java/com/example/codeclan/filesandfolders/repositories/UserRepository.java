package com.example.codeclan.filesandfolders.repositories;

import com.example.codeclan.filesandfolders.models.User;
import com.example.codeclan.filesandfolders.projections.EmbedUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedUser.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
