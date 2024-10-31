package org.ja.t1_club_cardmaven.controllers.card;

import com.google.zxing.WriterException;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.ja.t1_club_cardmaven.utils.QRCodeGenerator;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/qr")
@RequiredArgsConstructor
@Tag(name = "QR Code API", description = "API для управления QR кодами")
public class QRCodeController {

    private static final String DESTINATION_PATH = "http://localhost:8080/cards/";

    @Value("${qr-code-size}")
    private int qrCodeSize;

    @GetMapping(value = "/{id}/qr", produces = {MediaType.IMAGE_JPEG_VALUE, MediaType.IMAGE_PNG_VALUE})
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Получить QR код для доступа к карте", description = "Возвращает QR код, по которому можно получить карту.")
    public Resource getQRcode(@PathVariable UUID id) throws WriterException, IOException {

        ByteArrayOutputStream image = QRCodeGenerator.generateQRCodeImage(DESTINATION_PATH + id, qrCodeSize);

        return new ByteArrayResource(image.toByteArray());
    }
}