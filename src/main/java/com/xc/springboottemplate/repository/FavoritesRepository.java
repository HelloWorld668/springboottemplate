package com.xc.springboottemplate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xc.springboottemplate.domain.entity.Favorites;
import com.xc.springboottemplate.domain.entity.User;

public interface FavoritesRepository extends JpaRepository<Favorites, Long>{
}
