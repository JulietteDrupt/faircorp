package com.esme.spring.faircorp.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/api/buildings")
@Transactional
public class BuildingController {

    @Autowired
    private LightDao lightDao;
    @Autowired
    private RoomDao roomDao;
    @Autowired
    private BuildingDao buildingDao;
    @GetMapping
    public List<BuildingDto> findAll() {
        return buildingDao.findAll().stream().map(BuildingDto::new).collect(Collectors.toList());
    }

    @PostMapping
    public BuildingDto create(@RequestBody BuildingDto dto) {
        Building building = null;
        if (dto.getId() != null) {
            building = buildingDao.findById(dto.getId()).orElse(null);
        }

        if (building == null) {
            building = buildingDao.save(new Building());
        } else {
            buildingDao.save(building);
        }

        return new BuildingDto(building);
    }
}
