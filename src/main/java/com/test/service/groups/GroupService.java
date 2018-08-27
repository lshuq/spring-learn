package com.test.service.groups;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GroupService {
    @Resource
    GroupMapper groupMapper;

    public List<Group> getGroups() {
        return groupMapper.selectByExample(new GroupExample());
    }

    public Group getGroupsById(String gId){
        return groupMapper.selectByPrimaryKey(gId);
    }
}
