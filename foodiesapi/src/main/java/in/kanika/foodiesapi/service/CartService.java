package in.kanika.foodiesapi.service;

import in.kanika.foodiesapi.io.CartRequest;
import in.kanika.foodiesapi.io.CartResponse;

public interface CartService {

    CartResponse addToCart(CartRequest request);

    CartResponse getCart();

    void clearCart();

    CartResponse removeFromCart(CartRequest cartRequest);
}
