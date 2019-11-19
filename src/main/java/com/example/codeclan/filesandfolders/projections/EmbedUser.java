package com.example.codeclan.filesandfolders.projections;

import com.example.codeclan.filesandfolders.models.Folder;
import com.example.codeclan.filesandfolders.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types = User.class)
public interface EmbedUser {
    String getName();
    List<Folder> getFolders();
}
