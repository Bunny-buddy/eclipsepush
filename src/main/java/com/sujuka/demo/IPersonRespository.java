package com.sujuka.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRespository extends JpaRepository<Person, Integer> {

	@Query("select p from  Person p join p.passport ppt  where ppt.pnum=?1")
	Person getPersonByPassportnum(String pnum);

	@Query("select ppt from Person p join p.passport ppt where p.name=?1")
	Passport getPassportByPersonName(String name);

}
