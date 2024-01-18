package com.accenture.academy.church;

public class ChurchMapper {

    public static ChurchDao mapDtoToDao(ChurchDto churchDto){
        ChurchDao churchDao = new ChurchDao();
        churchDao.setName(churchDto.getName());
        churchDao.setNameOfCity(churchDto.getNameOfCity());
        churchDao.setBudget(churchDto.getBudget());
        churchDao.setNumberOfSeats(churchDto.getNumberOfSeats());
        churchDao.setNumberOfMembers(churchDto.getNumberOfMembers());

        return churchDao;
    }
    public static ChurchDao mapDtoToDao(ChurchDto churchDto, Long id){
        ChurchDao churchDao = new ChurchDao();
        churchDao.setId(id);
        churchDao.setName(churchDto.getName());
        churchDao.setNameOfCity(churchDto.getNameOfCity());
        churchDao.setBudget(churchDto.getBudget());
        churchDao.setNumberOfSeats(churchDto.getNumberOfSeats());
        churchDao.setNumberOfMembers(churchDto.getNumberOfMembers());

        return churchDao;
    }
}
