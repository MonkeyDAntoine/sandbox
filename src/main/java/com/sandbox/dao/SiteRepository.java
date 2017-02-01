package com.sandbox.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.sandbox.domain.Site;

@RepositoryRestResource(collectionResourceRel = "site", path = "site")
public interface SiteRepository extends PagingAndSortingRepository<Site, Long> {

}