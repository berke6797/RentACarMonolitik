package com.bilgeadam.rentacarmonolitik.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveCustomerRequestDto {
    String customerName;
    String companyName;
}
