package org.hibernate.envers.test.integration.ids.embeddedid;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

/**
 * An embeddable id that contains an embeded id
 * 
 * @author Thomas Rawyler
 */
@Embeddable
public class NestedEmbeddedId implements Serializable {
	@Embedded
	private ItemId id;

	@Column(name = "some")
	private String some;

	public ItemId getId() {
		return id;
	}

	public void setId(ItemId id) {
		this.id = id;
	}

	public String getSome() {
		return some;
	}

	public void setSome(String some) {
		this.some = some;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((some == null) ? 0 : some.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NestedEmbeddedId other = (NestedEmbeddedId) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (some == null) {
			if (other.some != null)
				return false;
		} else if (!some.equals(other.some))
			return false;
		return true;
	}

}