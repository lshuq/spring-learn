package com.test.controller;

import com.test.service.groups.Group;
import com.test.service.groups.GroupService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/groups")
public class GroupController {
    @Resource
    GroupService groupService;

    @RequestMapping("")
    public List<Group> groups() {
        return groupService.getGroups();
    }

    @RequestMapping("/{gId}")
    public Group groupsById(@PathVariable String gId) {
        return groupService.getGroupsById(gId);
    }
}
