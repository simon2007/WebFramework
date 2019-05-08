package org.blue.webframework.sys.siteparameter.model;

public class SiteParameter implements java.io.Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 5917081133749970061L;

	private int id;

    private String name;

    private String value;

    private String comment;

    private Boolean removeTag;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }


    public Boolean getRemoveTag() {
        return removeTag;
    }

    public void setRemoveTag(Boolean removeTag) {
        this.removeTag = removeTag;
    }

}