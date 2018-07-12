package com.ust.datasource.persistence;

import com.ust.datasource.api.Data;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "data", path = "data")
public interface DataRepository extends PagingAndSortingRepository<Data, String> {

}
