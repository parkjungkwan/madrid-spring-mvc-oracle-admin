package net.zerotodev.oracle.photo.domain;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component @Data
public class PhotoDto {
	private int photoId, albumId, locationId, memberId, photoView;
	private String title, photoDescription, privacy, uploadDate, imagePath;
	public int getPhotoId() {
		return photoId;
	}
	public void setPhotoId(int photoId) {
		this.photoId = photoId;
	}
	public int getAlbumId() {
		return albumId;
	}
	public void setAlbumId(int albumId) {
		this.albumId = albumId;
	}
	public int getLocationId() {
		return locationId;
	}
	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getPhotoView() {
		return photoView;
	}
	public void setPhotoView(int photoView) {
		this.photoView = photoView;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPhotoDescription() {
		return photoDescription;
	}
	public void setPhotoDescription(String photoDescription) {
		this.photoDescription = photoDescription;
	}
	public String getPrivacy() {
		return privacy;
	}
	public void setPrivacy(String privacy) {
		this.privacy = privacy;
	}
	public String getUploadDate() {
		return uploadDate;
	}
	public void setUploadDate(String uploadDate) {
		this.uploadDate = uploadDate;
	}
	public String getImagePath() {
		return imagePath;
	}
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	@Override
	public String toString() {
		return "PhotoDto [photoId=" + photoId + ", albumId=" + albumId + ", locationId=" + locationId + ", memberId="
				+ memberId + ", photoView=" + photoView + ", title=" + title + ", photoDescription=" + photoDescription
				+ ", privacy=" + privacy + ", uploadDate=" + uploadDate + ", imagePath=" + imagePath + "]";
	}
	
	
}
