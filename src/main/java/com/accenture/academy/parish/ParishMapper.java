package com.accenture.academy.parish;

public class ParishMapper {

    public static ParishDao mapDtoToDao(ParishDto parishDto) {
        ParishDao parishDao = new ParishDao();

        parishDao.setPriestDao(parishDto.getPriestDao());
        parishDao.setChurchDao(parishDto.getChurchDao());
        parishDao.setMembers(parishDto.getMembers());

        return parishDao;
    }

//    public static ParishDto mapDtoToDao(ParishDao parishDao){
//        ParishDao parishDao = new ParishDao();
//        parishDao.setParishName(parishDto.getParishName());
//        parishDao.set(parishDto.getParishName());
//    }
}
