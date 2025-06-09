package com.entitys;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Setter
@Getter
@Data
public class Dimensions {

	int length;
	int width;
	int height;
}
