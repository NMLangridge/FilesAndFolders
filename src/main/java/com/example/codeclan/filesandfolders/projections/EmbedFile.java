package com.example.codeclan.filesandfolders.projections;

import com.example.codeclan.filesandfolders.models.File;
import com.example.codeclan.filesandfolders.models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "embedFile", types = File.class)
public interface EmbedFile {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
