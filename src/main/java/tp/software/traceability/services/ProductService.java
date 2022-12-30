package tp.software.traceability.services;
import java.util.List;
import tp.software.traceability.shared.dto.ProductDto;
public interface ProductService {
    List<ProductDto> getAllProducts();

    ProductDto getProductById(Long id);

    ProductDto createProduct(ProductDto productDto);

    ProductDto updateProduct(Long id, ProductDto productDto);

    void deleteProduct(Long id);
}