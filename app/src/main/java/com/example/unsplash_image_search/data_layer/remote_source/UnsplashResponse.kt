import com.example.unsplash_image_search.data_layer.model.UnsplashPhoto

data class UnsplashResponse(
    val results: List<UnsplashPhoto>
)