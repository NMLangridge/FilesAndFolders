package com.example.codeclan.filesandfolders.projections;

import com.example.codeclan.filesandfolders.models.File;
import com.example.codeclan.filesandfolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolder", types = Folder.class)
public interface EmbedFolder {
    String getTitle();
    List<File> getFiles();
}
