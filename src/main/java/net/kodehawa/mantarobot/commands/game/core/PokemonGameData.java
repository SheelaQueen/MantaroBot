/*
 * Copyright (C) 2016-2019 David Alejandro Rubio Escares / Kodehawa
 *
 * Mantaro is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * Mantaro is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Mantaro.  If not, see http://www.gnu.org/licenses/
 *
 */

package net.kodehawa.mantarobot.commands.game.core;

import java.util.List;

public class PokemonGameData {
    private String name;
    private String image;
    private List<String> names;
    
    public PokemonGameData() {
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getImage() {
        return this.image;
    }
    
    public List<String> getNames() {
        return this.names;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setImage(String image) {
        this.image = image;
    }
    
    public void setNames(List<String> names) {
        this.names = names;
    }
    
    public boolean equals(final Object o) {
        if(o == this) return true;
        if(!(o instanceof PokemonGameData)) return false;
        final PokemonGameData other = (PokemonGameData) o;
        if(!other.canEqual((Object) this)) return false;
        final Object this$name = this.name;
        final Object other$name = other.name;
        if(this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$image = this.image;
        final Object other$image = other.image;
        if(this$image == null ? other$image != null : !this$image.equals(other$image)) return false;
        final Object this$names = this.names;
        final Object other$names = other.names;
        if(this$names == null ? other$names != null : !this$names.equals(other$names)) return false;
        return true;
    }
    
    protected boolean canEqual(final Object other) {
        return other instanceof PokemonGameData;
    }
    
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.name;
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $image = this.image;
        result = result * PRIME + ($image == null ? 43 : $image.hashCode());
        final Object $names = this.names;
        result = result * PRIME + ($names == null ? 43 : $names.hashCode());
        return result;
    }
    
    public String toString() {
        return "PokemonGameData(name=" + this.name + ", image=" + this.image + ", names=" + this.names + ")";
    }
}
