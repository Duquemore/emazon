package com.emazon.stock.emazon.adapters.driving.http.mapper;

import com.emazon.stock.emazon.adapters.driving.http.dto.response.CategoryResponse;
import com.emazon.stock.emazon.domain.model.Category;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ICategoryResponseMapper {
    CategoryResponse toCategoryResponse(Category category);
    List<CategoryResponse> toCategoryResponseList(List<Category> categories);
}
