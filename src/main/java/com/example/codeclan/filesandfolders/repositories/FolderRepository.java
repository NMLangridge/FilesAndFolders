package com.example.codeclan.filesandfolders.repositories;

import com.example.codeclan.filesandfolders.models.Folder;
import com.example.codeclan.filesandfolders.projections.EmbedFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolder.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
