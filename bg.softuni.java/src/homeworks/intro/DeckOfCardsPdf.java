package homeworks.intro;

import java.io.IOException;
import java.io.FileOutputStream;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class DeckOfCardsPdf {

	private static final String docPath = "bin/homeworks/DeckOfCards.pdf";
	private static final String[] cardsColors = new String[] { 
		"\u2663","\u2666", "\u2660", "\u2665" };
	private static final String[] cards = new String[] { "2", "3", "4", "5",
			"6", "7", "8", "9", "10", "J", "Q", "K", "A" };
	// 52 cards: 4 colors by 13 cards (2 3 4 5 6 7 8 9 10 J Q K A)
			// spade ♠, diamond ♦, club ♣, heart ♥

	public static void main(String[] args) throws DocumentException,
			IOException {

		Document document = new Document();

		PdfWriter.getInstance(document,	new FileOutputStream(docPath));
		document.open();
		//Adjust font
		BaseFont baseFontArial = BaseFont.createFont("/homeworks/intro/arial.ttf", BaseFont.IDENTITY_H,
                BaseFont.EMBEDDED);
		Font fontRed = new Font(baseFontArial, 35f, 1, 
				BaseColor.RED); 
		Font fontBlack = new Font(baseFontArial, 35f, 1,
				BaseColor.BLACK);

		PdfPTable table = new PdfPTable(7);
		/*Cards are printed by 4 in a row, and the columns are 7, 
		to have 3 empty cells between cards. 
		*/ 
		int[] columnWidths = { 4, 1, 4, 1, 4, 1, 4 };
		table.setWidths(columnWidths);

		for (int i = 0; i < cards.length; i++) {
			PdfPCell emptyCell = new PdfPCell();
			for (int j = 0; j < cardsColors.length; j++) {

				PdfPCell cell = new PdfPCell();
				Paragraph card;

				if (j % 2 == 0) {
					//Even column -> print black suit
					card = new Paragraph((cards[i] + " " + cardsColors[j]),
							fontBlack);
				} else {
					//Odd column -> print red suit
					card = new Paragraph((cards[i] + " " + cardsColors[j]),
							fontRed);
				}
				System.out.println(card);
				cell = new PdfPCell(card);
				cell.setHorizontalAlignment(Element.ALIGN_CENTER);
				cell.setBorderWidth(2);
				cell.setPaddingTop(50);
				cell.setPaddingBottom(60);
				table.addCell(cell);
				if (j < 3) {
					//add empty cell after each card but last
					emptyCell.setBorder(0);
					table.addCell(emptyCell);
				}

			}
			//add empty table to set the white space after each row 
			PdfPCell emptyRowCell = new PdfPCell();
			
			for (int j = 0; j < columnWidths.length; j++) {
				emptyRowCell.setBorder(0);
				emptyRowCell.setFixedHeight(50);
				table.addCell(emptyRowCell);
			}
		}
		document.add(table);
		document.close();

	}
}
