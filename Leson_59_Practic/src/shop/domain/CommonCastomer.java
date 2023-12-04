package shop.domain;

import shop.domain.interfases.Cart;
import shop.domain.interfases.Castomer;

import java.util.Objects;

public class CommonCastomer implements Castomer {
    private int id;
    private boolean isActiv;
    private String name;
    private Cart cart;

    public CommonCastomer(String name, Cart cart) {
        this.name = name;
        this.cart = cart;
        this.isActiv = true;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public boolean isActiv() {
        return isActiv;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Cart getCart() {
        return cart;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommonCastomer that = (CommonCastomer) o;
        return id == that.id && isActiv == that.isActiv && Objects.equals(name, that.name) && Objects.equals(cart, that.cart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, isActiv, name, cart);
    }

    @Override
    public String toString() {
        return String.format("Castomer: id - %d, name - %s, activ - %s, in cart - %s.",
                              id, name, isActiv ? "yes" : "no", cart);
    }
}
