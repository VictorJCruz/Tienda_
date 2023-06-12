/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.impl;

import com.tienda.commons.JasperReportManager;
import com.tienda.enums.TipoReporteEnum;
import com.tienda.model.ReportePersonasDTO;
import com.tienda.service.api.ReportePersonasAPI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;
import javax.sql.DataSource;
import net.sf.jasperreports.engine.JRException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author josea
 */
/*@Service*/
public class ReportePersonasImpl implements ReportePersonasAPI {
/*
    @Autowired
    private JasperReportManager reportManager;

    @Autowired
    private DataSource dataSource;

    /**
     * @author <a href="mailto:4softwaredevelopers@gmail.com">Jordy
     * Rodríguezr</a>
     * @date 24 sep. 2021
     * @param params
     * @return
     * @throws SQLException
     * @throws IOException
     * @throws JRException
     * @see
     * com.example.demospringbootjasper.service.api.ReporteVentasServiceAPI#obtenerReporteVentas(java.util.Map)
     */
    
    /*
    @Override
    public ReportePersonasDTO obtenerReportePersonas(Map<String, Object> params)
            throws JRException, IOException, SQLException {
        String fileName = "PersonasReport";
        ReportePersonasDTO dto = new ReportePersonasDTO();
        String extension = params.get("tipo").toString().equalsIgnoreCase(TipoReporteEnum.EXCEL.name()) ? ".xlsx" : ".pdf";
        dto.setFileName(fileName + extension);
        
        ByteArrayOutputStream stream = reportManager.export(fileName, params.get("tipo").toString(), params,
                dataSource.getConnection());
        byte[] bs = stream.toByteArray();
        dto.setStream(new ByteArrayInputStream(bs));
        dto.setLength(bs.length);

        return dto;
    }
    */
}
