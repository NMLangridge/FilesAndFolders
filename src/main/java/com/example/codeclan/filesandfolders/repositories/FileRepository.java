package com.example.codeclan.filesandfolders.repositories;

import com.example.codeclan.filesandfolders.models.File;
import com.example.codeclan.filesandfolders.projections.EmbedFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFile.class)
public interface FileRepository extends JpaRepository<File, Long> {
}
