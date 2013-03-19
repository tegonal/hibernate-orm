package org.hibernate.envers.test.integration.ids.embeddedid;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import org.hibernate.envers.Audited;

/**
 * @author Thomas Rawyler
 */
@Entity
@Audited
public class NestedEmbeddedItem implements Serializable {
	@EmbeddedId
	private NestedEmbeddedId id;

	public NestedEmbeddedItem(NestedEmbeddedId id) {
		this.id = id;
	}

	public NestedEmbeddedId getId() {
		return id;
	}

	public void setId(NestedEmbeddedId id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		NestedEmbeddedItem other = (NestedEmbeddedItem) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}