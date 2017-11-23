package models;

import java.util.List;
import javax.persistence.Entity;
import io.ebean.Finder;
import models.raven.BaseModel;

@Entity
public class SampleEntity extends BaseModel {
	
	public static Finder<Long, SampleEntity> find = new Finder<>(SampleEntity.class);
	public static List<SampleEntity> getAllCurrent() {
		return find.query().where().eq("current", true).findList();
	}
	
	public static SampleEntity findByUUID(String uuid) {
		return find.query().where().eq("uuid", uuid).findUnique();
	}
}
